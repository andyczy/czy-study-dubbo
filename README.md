# dubbo-first
dubbo入门案例

[博文跟踪-czydub](http://blog.csdn.net/javawebrookie/article/details/66478685 "悬停显示")


Dubbo （http://dubbo.io/）是阿里巴巴公司开源的一个高性能优秀的分布式服务框架，高性能和透明化的RPC远程服务调用方案 、 SOA服务治理方案、并且和 spring框架无缝集成。

        主要核心部件：
                Remoting:网络通信框架，实现了 sync-over-async 和 request-response 消息机制。
                RPC:一个远程过程调用的抽象，支持负载均衡、容灾和集群功能。
                Registry: 服务目录框架用于服务的注册和服务事件发布和订阅。
