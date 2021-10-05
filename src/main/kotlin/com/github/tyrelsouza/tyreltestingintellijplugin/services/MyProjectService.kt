package com.github.tyrelsouza.tyreltestingintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.tyrelsouza.tyreltestingintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
