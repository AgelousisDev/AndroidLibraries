[logo]: https://raw.githubusercontent.com/AgelousisDev/MaterialSearchViewProject/master/material_search_view.jpg

> Material Search View

MaterialSearchView is a View that represents the SearchView most google apps have

> Gradle
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
dependencies {
	implementation 'com.github.AgelousisDev:MaterialSearchViewProject:Tag'
}
```

> Usage
```
<com.agelousis.materialsearchview.MaterialSearchView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:searchHint="Search Here"/>
```
```
materialSearchView.iconFromFile = //File
materialSearchView.iconFromBitmap = //Bitmap
materialSearchView.iconFromByteArray = //ByteArray
materialSearchView.iconFromVectorResourceId = //ResourceId
materialSearchView.iconFromVectorResourceId = //Vector XML Drawable
        
materialSearchView.onIconClicked {
            
}
materialSearchView.onQueryListener { 
            
}
```
