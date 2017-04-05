# dubbo-first
学习 dubbo

[博文跟踪-czydub](http://blog.csdn.net/javawebrookie/article/details/66478685 "悬停显示")


Dubbo 是阿里巴巴公司开源的一个高性能优秀的分布式服务框架，高性能和透明化的RPC远程服务调用方案 、 SOA服务治理方案、并且和 spring框架无缝集成。

        主要核心部件：
                Remoting:网络通信框架，实现了 sync-over-async 和 request-response 消息机制。
                RPC:一个远程过程调用的抽象，支持负载均衡、容灾和集群功能。
                Registry: 服务目录框架用于服务的注册和服务事件发布和订阅。


Dubbo能做什么？
A. 透明化的远程方法调用 ：就像调用本地方法一样调用远程方法 – 只需简单配置，没有任何API侵入。
B. 软负载均衡及容错机制 ：可在内网替代F5等硬件负载均衡器 。
C. 服务自动注册与发现 ：不再需要写死服务提供方地址，注册中心基于接口名查询服务提 供者的IP地址，并且能够平滑添加或删除服务提供者。


包名：
    1、hello：入门程序
    2、dependency：两层依赖
    3、direct：直连提供者配置