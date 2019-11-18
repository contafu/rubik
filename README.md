# Rubik - Android 开发工具类

- #### 设置状态栏颜色
##### Kotlin
```kotlin
(Activity)setStatusBarColor(colorInt, isFitToSafeArea)
```
##### Java
```java
Rubik.setStatusBarColor(context, colorInt, isFitToSafeArea)
```
______

- #### 设置导航栏颜色
##### Kotlin
```kotlin
(Activity)setNavigationBarColor(colorInt)
```
##### Java
```java
Rubik.setNavigationBarColor(context, colorInt)
```
______

- #### 获取屏幕宽度
##### Kotlin
```kotlin
(Context)getScreenWidth()
```
##### Java
```java
Rubik.getScreenWidth(context)
```
______

- #### 获取屏幕高度
##### Kotlin
```kotlin
(Context)getScreenHeight()
```
##### Java
```java
Rubik.getScreenHeight(context)
```
______

- #### 启动定时器
##### Kotlin(协程)
```kotlin
(CoroutineScope)cd()
```
______

- #### px转dp
##### Kotlin
```kotlin
px2dp(px)
```
##### Java
```java
Rubik.px2dp(px)
```
______

- #### dp转px
##### Kotlin
```kotlin
dp2px(dp)
```
##### Java
```java
Rubik.dp2px(dp)
```
______

- #### 点击抖动过滤
##### Kotlin
```kotlin
(View)onFilterShakeClick {
    //TODO: Do Some Thing
}
```
##### Java
```java
Rubik.onFilterShakeClick(button, v -> {
    //TODO: Do Some Thing
});
```