//package com.example.lisener;
//
//import com.rabbitmq.client.Channel;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class Monitor {
//
//    private static Logger logger = LoggerFactory.getLogger(Monitor.class);
//
//    @Autowired
//    private LisenerUtil lisenerUtil;
//    /**
//     * 导线温度消费者
//     * @param msgList
//     * @param channel
//     * @param deliverTag
//     * @throws Exception
//     */
//    @RabbitListener(queues = "dxwd_sdqjwebt",containerFactory = "consumerBatchContainerFactory")
////    public void receiveDxwd(List<String> msgList, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliverTag) throws Exception {
//    public void receiveDxwd(Channel channel, Message message) throws Exception {
//        List<String> msgList = Arrays.asList(new String(message.getBody()));
//        logger.info("【导线温度】数据msg数量:"+msgList.size());
//        logger.info("【导线温度】数据执行开始："+System.currentTimeMillis());
//        if(msgList.size()>0){
//            for (String msg : msgList) {
//                lisenerUtil.dxwd(msg);
//            }
//        }
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
//        logger.info("【导线温度】数据执行结束："+System.currentTimeMillis());
//    }
//}
