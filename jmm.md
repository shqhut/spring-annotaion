# jmm java内存模型

####线程和进程的关系
程序在操作系统中并不是以进程为单位执行的，而是以线程的形式执行，
一个进程可以拥有多个线程，进程创建的时候，一般会有一个主线程随着
进程创建而创建。

####java内存模型
1、可见性问题：CPU中运行的线程从主存中拷贝共享变量obj到它的CPU缓存，把obj的count变量改为2，但这个变量变动对其他线程是不可见的，以为这个更改还每flush到主存中；

####synchronized锁升级过程


####CAS (Compare and Swap)
乐观锁的一种典型实现机制（CAS）
乐观锁主要就是两个步骤：冲突检测和数据更新。
当多个线程尝试使用CAS同时更新同一个变量时，只有一个线程可以更新变量的值，其他的线程都会失败，失败的线程并不会挂起，而是告知这次竞争中失败了，并可以再次尝试。
CAS其实就是一个：我认为位置 V 应该包含值 A；如果包含该值，则将 B 放到这个位置；否则，不要更改该位置，只告诉我这个位置现在的值即可。

####ThreadLocal


####线程池

####创建线程的方式

####线程状态的切换