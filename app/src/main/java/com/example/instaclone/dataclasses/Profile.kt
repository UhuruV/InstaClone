package com.example.instaclone.dataclasses

data class Profile(
    var username:String,
    var avatarUrl:String,
    var profileName:String,
    var bio:String,
    var posts:Int,
    var followers:Int,
    var following:Int,
    var highlightUrl:String,
    var highLightName: String,
    var imageUrl:String
)
