//package com.example.lisener;
//
//import com.example.mapper.TZxjcDxwdMapper;
//import com.example.model.SxdlDxwd;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Component;
//
//@Component
//public class LisenerUtil {
//    private static final Logger logger = LoggerFactory.getLogger(LisenerUtil.class);
//    @Autowired
//    private TZxjcDxwdMapper tZxjcDxwdMapper;
//
//    @Async("asyncDxwd")
//    public void dxwd(String msg){
//        try {
//            SxdlDxwd sxdlDxwd = JSONObject.parseObject(msg,SxdlDxwd.class);
//            logger.info("【导线温度】设备信息Id"+sxdlDxwd.getSbid());
//            int a = tZxjcDxwdMapper.insertTZxjcDxwd(sxdlDxwd);
//            if(a>0){
//                logger.info("【导线温度】设备信息入库成功：");
//            }else {
//                logger.info("【导线温度】设备信息入库失败："+ JSONObject.toJSONString(sxdlDxwd));
//            }
//        } catch (Exception e) {
//            logger.error("【导线温度】入库报错："+e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}
