## 一、Java语言发展史

- 语言：人与人交流沟通的表达方式
- 计算机语言：人与计算机之间进行信息交流沟通的一种特殊语言
- Java语言是美国Sun公司（Stanford University Network）在1995年推出的计算机语言
  Java之父：詹姆斯·高斯林（James Gosling）

![1.1](https://gitee.com/zgf1366/pic_store/raw/master/img/20210129181615.png)

2009年，Sun公司被甲骨文公司收购，所以我们现在访问oracle官网即可：https://www.oracle.com

![1.2](https://gitee.com/zgf1366/pic_store/raw/master/img/20210129181631.png)

## 二、Java语言跨平台原理

平台指的是操作系统

- Windows
- Mac
- Linux

Java程序并非是直接运行的，Java编译器将Java源程序编译成与平台无关的字节码文件(class文件)，然后由Java虚拟机（JVM）对字节码文件解释执行。所以在不同的操作系统下，只需安装不同的Java虚拟机即可实现java程序的跨平台。

![1.2.1](https://gitee.com/zgf1366/pic_store/raw/master/img/20210129181650.png)

## 三、JRE和JDK

- `JVM`（Java Virtual Machine），Java虚拟机
- `JRE`（Java Runtime Environment），Java运行环境，包含了JVM和Java的核心类库（Java API），我们想要运行一个已有的Java程序，那么只需安装 JRE 即可。 
- `JDK`（Java Development Kit）称为Java开发工具，包含了JRE和开发工具，其中的开发工具：编译工具（javac.exe）和运行工具（java.exe）。我们想要开发一个全新的Java程序，那么必须安装 JDK。

JDK、JRE和JVM的关系：

![1.3.1](https://gitee.com/zgf1366/pic_store/raw/master/img/20210129181725.png)

**总结：**

我们只需安装JDK即可，它包含了java的运行环境和虚拟机。

## 四、常用DOS命令

在接触集成开发环境之前，我们需要使用命令行窗口对java程序进行编译和运行，所以需要知道一些常用DOS命令。
1、打开命令行窗口的方式：win + r打开运行窗口，输入cmd，回车。

![1.5.1](https://gitee.com/zgf1366/pic_store/raw/master/img/20210129181806.png)

2、常用命令及其作用

|        操作        |               说明                |
| :----------------: | :-------------------------------: |
|     盘符名称:      | 盘符切换。E:回车，表示切换到E盘。 |
|        dir         |      查看当前路径下的内容。       |
|      cd 目录       |     进入单级目录。cd itheima      |
|       cd ..        |        回退到上一级目录。         |
| cd 目录1\目录2\... |  进入多级目录。cd itheima\JavaSE  |
|        cd \        |         回退到盘符目录。          |
|        cls         |              清屏。               |
|        exit        |       退出命令提示符窗口。        |

## 五、Java程序开发运行流程

开发Java程序，需要三个步骤：编写程序，编译程序，运行程序。

![1.7.1](https://gitee.com/zgf1366/pic_store/raw/master/img/20210129182339.png)

## 六、计算机存储单元

我们知道计算机是可以用来存储数据的，但是无论是内存还是硬盘，计算机存储设备的最小信息单元叫" 位（bit）"，我们又称之为"比特位"，通常用小写的字母"b"表示。而计算机中最基本的存储单元叫"字节（byte）"，通常用大写字母"B"表示，字节是由连续的8个位组成。
除了字节外还有一些常用的存储单位，其换算单位如下：
1B（字节） = 8bit
1KB = 1024B
1MB = 1024KB
1GB = 1024MB
1TB = 1024GB



