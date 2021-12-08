package com.moon.runwords

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Favorite : NavigationItem("favorite", R.drawable.ic_favorite, "Favorite")
    object Info : NavigationItem("info", R.drawable.ic_info, "Info")
}