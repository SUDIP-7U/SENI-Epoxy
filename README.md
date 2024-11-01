kapt {
    correctErrorTypes = true
}
android {
    dataBinding {
        enabled true
    }
}

dependencies {
//Epoxy & Epoxy databinding 
//kapt
    implementation "com.airbnb.android:epoxy:$epoxyVersion"
    kapt "com.airbnb.android:epoxy-processor:$epoxyVersion"
    implementation "com.airbnb.android:epoxy-databinding:$epoxyVersion"
}
dependencies {
//Gson
  implementation 'com.google.code.gson:gson:2.11.0'
}
dependencies {
//Glide
  implementation 'com.github.bumptech.glide:glide:4.16.0'
}
