package com.ray.test;

import org.junit.Test;

import com.ray.service.TempMaterialService;
import com.ray.util.WeiXinParamesUtil;
import com.ray.util.WeiXinUtil;

/**@desc  : 临时素材
 * 
 * @author: shirayner
 * @date  : 2017-8-18 下午2:06:10
 */
public class TempMaterialTest {

    @Test
    public void testUploadTempMaterial(){
        //1.初始化参数
        String fileUrl="D:/Users/shiyuou/Pictures/g8Ty-fynhhay8328357.jpg";
        String type="image";
        String accessToken= WeiXinUtil.getAccessToken(WeiXinParamesUtil.corpId, WeiXinParamesUtil.contactsSecret).getToken();
        //2.调用业务类，上传临时素材
        TempMaterialService tms=new TempMaterialService();
        tms.uploadTempMaterial(accessToken, type, fileUrl);
       }
}