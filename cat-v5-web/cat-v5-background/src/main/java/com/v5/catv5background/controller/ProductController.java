package com.v5.catv5background.controller;

import com.cat.v5.entity.TProduct;
import com.cat.v5.product.interfaces.IProductService;
import com.github.pagehelper.PageInfo;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.v5.catv5background.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private IProductService productService;
    @Autowired
    private FastFileStorageClient fastFileStorageClient;
    @Value("${image.server}")
    private String imageServer;

    @RequestMapping("getHello")
    @ResponseBody
    public String getHello() {
        return "hello";
    }

    @RequestMapping(value = "/testIndex", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * 用pageHelp pageInfo 分页
     */
    @RequestMapping(value = "/list/{pageIndex}/{pageSize}", method = RequestMethod.GET)
    public String list(Model model, @PathVariable("pageIndex") Integer pageIndex, @PathVariable("pageSize") Integer pageSize) {
        //   List<TProduct> list = productService.list();
        PageInfo<TProduct> pageInfo = productService.getPage(pageIndex, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "product/product_list";
    }

    /**
     * 添加商品
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(TProduct tProduct, MultipartFile imageFile) {
        String originalFilename = imageFile.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        System.out.println("suffix-->"+suffix);
        try {
            //上传文件，缩略图
            StorePath storePath = fastFileStorageClient.uploadImageAndCrtThumbImage(imageFile.getInputStream(),
                    imageFile.getSize(), suffix, null);
            //获取存储在服务器上的路径
            String fullPath = storePath.getFullPath();
            System.out.println("fullpath"+fullPath);
            System.out.println(imageServer+fullPath);
            tProduct.setImage(imageServer+fullPath);
            String thumImage = ImageUtil.replace100_100(imageServer + fullPath);
            System.out.println("thumImage-->"+thumImage);
            tProduct.setBreviaryImage(thumImage);
            //存DB
            int insert = productService.insertSelective(tProduct);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/product/list/1/1";
    }
}
