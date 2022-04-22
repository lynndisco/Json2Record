package com.github.lynndisco.json2record.services

import com.intellij.openapi.project.Project
import com.github.lynndisco.json2record.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
