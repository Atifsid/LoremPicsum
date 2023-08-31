object Versions {
    const val core  = "1.10.1"
    const val appCompact = "1.6.1"
    const val androidMaterial = "1.9.0"
    const val constrainLayout = "2.1.4"

    const val testImplJunit = "4.13.2"
    const val androidTest = "1.1.5"
    const val androidTestEspresso = "3.5.1"

    const val dagger = "2.44"
    const val hiltCompiler = "1.0.0"

    const val retrofit = "2.9.0"
    const val gsonConvertor = "2.9.0"
    const val okHttp = "4.9.0"
    const val scalerConvertor = "2.1.0"

    const val kotlinCoroutines = "1.6.1"
    const val coroutineLifecycleScope = "2.5.1"

    const val glide = "4.12.0"

    const val viewModelDeligate = "1.7.2"

    const val swipeRefresh = "1.1.0"

    const val composeBom = "2023.08.00"

    const val composeActivity = "1.7.2"
    const val composeViewModel = "2.6.1"
}

object Deps {
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val appCompact = "androidx.appcompat:appcompat:${Versions.appCompact}"
    const val androidMaterial = "com.google.android.material:material:${Versions.androidMaterial}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constrainLayout}"
    const val androidMaterial3 = "androidx.compose.material3:material3"
}

object TestImplementation {
    const val junit = "junit:junit:${Versions.testImplJunit}"
}

object AndroidTestImplementation {
    const val junit = "androidx.test.ext:junit:${Versions.androidTest}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.androidTestEspresso}"
}

object DaggerHilt {
    const val hilt  = "com.google.dagger:hilt-android:${Versions.dagger}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.dagger}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Versions.gsonConvertor}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val scalersConvertors = "com.squareup.retrofit2:converter-scalars:${Versions.scalerConvertor}"
}

object Coroutines {
    const val coroutineCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
    const val coroutineAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
}

object CoroutinesLifecycleScope {
    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.coroutineLifecycleScope}"
    const val lifeCycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.coroutineLifecycleScope}"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val annotationProcessor = "com.github.bumptech.glide:compiler:${Versions.glide}"
}

object ViewModelDelegate {
    const val viewModelDeligate = "androidx.activity:activity-ktx:${Versions.viewModelDeligate}"
}

object CircularProgressBar {
    const val swipeRefresh =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefresh}"
}

object ComposeBOM {
    const val bom = "androidx.compose:compose-bom:${Versions.composeBom}"
}

object ComposePreview {
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
}

object ComposeTestImplementation {
    const val composeJunit = "androidx.compose.ui:ui-test-junit4"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
}

object MaterialIcon {
    const val iconsCore = "androidx.compose.material:material-icons-core"
    const val iconsExtended = "androidx.compose.material:material-icons-extended"
    const val windowSize = "androidx.compose.material3:material3-window-size-class"
}

object ComposeSpecific {
    const val activity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModel}"
    const val liveData = "androidx.compose.runtime:runtime-livedata"
    const val rxJava = "androidx.compose.runtime:runtime-rxjava2"
}