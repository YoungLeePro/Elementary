package com.yt.jvm;

import sun.misc.Launcher;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @USER: Young
 * @DATETIME: 2020/8/23
 * @DESCRIPTION:
 **/
public class ParentClassloaderDemo {
    public static void main(String[] args) {
        // 1.bootstrapClassloader
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL bootstrapUrl: urLs) {
            System.out.println("bootstrapUrl启动类加载==="+bootstrapUrl);
        }
        System.out.println("分割线==========================");
        // 2.extendClassloader
        URLClassLoader parent = (URLClassLoader) ClassLoader.getSystemClassLoader().getParent();
        URL[] urLs1 = parent.getURLs();
        for (URL bootstrapUrl: urLs1) {
            System.out.println("扩展类加载器加载==="+bootstrapUrl);
        }
        System.out.println("分割线==========================");
        URLClassLoader systemClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        URL[] urLs2 = systemClassLoader.getURLs();
        for (URL bootstrapUrl: urLs2) {
            System.out.println("应用加载器加载==="+bootstrapUrl);
        }
    }
}
