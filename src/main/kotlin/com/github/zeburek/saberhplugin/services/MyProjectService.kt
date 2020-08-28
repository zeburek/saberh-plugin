package com.github.zeburek.saberhplugin.services

import com.intellij.openapi.project.Project
import com.github.zeburek.saberhplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
