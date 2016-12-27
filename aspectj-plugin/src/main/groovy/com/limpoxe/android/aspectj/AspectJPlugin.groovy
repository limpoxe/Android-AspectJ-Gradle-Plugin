package com.limpoxe.android.aspectj

import com.android.build.gradle.AppPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class AspectJPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        def isApplication = project.plugins.withType(AppPlugin)
        if (!isApplication) {
            throw new IllegalStateException("'android' plugin required.")
        }

        //创建配置项
        project.extensions.create('aspectj', AspectJExtension)

        //weaving在下面这个任务中触发
        project.android.registerTransform(new AspectJTransform(project))

        //向app中添加此依赖，aspectj向class插入的代码运行时依赖下面这个库
        project.dependencies {
            compile 'org.aspectj:aspectjrt:1.8.9'
        }
    }

}