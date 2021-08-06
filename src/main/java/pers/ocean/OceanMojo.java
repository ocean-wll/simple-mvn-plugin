package pers.ocean;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @Description mojo类
 * @Author ocean_wll
 * @Date 2021/8/6 4:56 下午
 */
// mojo注解就是maven插件的注解
// 后面配置的是生命周期，我这里配置了CLEAN，即默认是打包时候执行本插件（这个可以在pom文件指定）
@Mojo(name = "oceanMojo", defaultPhase = LifecyclePhase.CLEAN)
public class OceanMojo extends AbstractMojo {

    // 配置的是本maven插件的配置，在pom使用configration标签进行配置 property就是名字，
    // 在配置里面的标签名字。在调用该插件的时候会看到
    @Parameter(property = "application")
    private String application;

    @Parameter(property = "sourceFolderPath")
    private String sourceFolderPath;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.printf("Hello World ocean: 应用名称: %s | 当前应用根目录: %s%n",
                application,
                sourceFolderPath);
    }
}
