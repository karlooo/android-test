package com.example.notekeeper

object DataManager
{
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init
    {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses()
    {
        var course = CourseInfo( "android_auto", "Android Auto Programming" )
        courses.set( course.courseId, course )

        course = CourseInfo( courseId = "android_intents", title = "Android Programming with Intents" )
        courses.set( course.courseId, course )

        course = CourseInfo( courseId = "android_sync", title = "Android Async Programming and Services")
        courses.set( course.courseId, course )

        course = CourseInfo( courseId = "java_core", title = "Java Fundamentals: The core platform")
        courses.set( course.courseId, course )
    }

    private fun initializeNotes()
    {
        //class NoteInfo ( var course: CourseInfo, var title: String, var text: String )
        var note = NoteInfo ( CourseInfo("android_auto", "Android Auto Programming"), "Android Auto Programming", "Notes in Auto")
        notes.add(note)

        note = NoteInfo ( CourseInfo( courseId = "android_intents", title = "Android Programming with Intents" ), "Android Programming with Intents", "Notes for intents")
        notes.add(note)

        note = NoteInfo ( CourseInfo( courseId = "android_intents", title = "Android Programming with Intents" ), "Android Programming with Intents", "Notes for intents Again")
        notes.add(note)
    }
}