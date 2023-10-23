package com.alibaba.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: shutu
 * @date: 2022/4/13 22:18
 */
/**
 * @description:
 * @author: shutu
 * @date: 2022/4/23 22:30
 */
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        //          PayService target = new AliPayService();
//          PayService proxy = (PayService) Enhancer.create(target.getClass(), new CglibEnhancer(target));
//          proxy.pay();

//        PayService target = new AliPayService();
//        PayService proxy = (PayService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
//                new Class[]{PayService.class}, new PayJdkProxy(target));
//        proxy.pay();

//        final Class<Create> createClass = Create.class;
//        final Method[] declaredMethods = createClass.getDeclaredMethods();
//        for(Method method : declaredMethods){
//            if(method.isAnnotationPresent(OrderInterface.class)){
//                method.invoke(createClass.getConstructor(null).newInstance(null),null);
//                final OrderInterface annotation = method.getAnnotation(OrderInterface.class);
//                System.out.println(annotation.name());
//            }
//        }
    }
}
