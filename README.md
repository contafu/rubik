# Rubik - Android 开发工具类

### Kotlin

#### 通过扩展函数调用
```kotlin
(Activity)setStatusBarColor(colorInt, isFitToSafeArea)
```

```kotlin
(Activity)setNavigationBarColor(colorInt)
```

```kotlin
(Context)getScreenWidth()
```

```kotlin
(Context)getScreenHeight()
```

```kotlin
(Context)px2dp(px)
```

```kotlin
(Context)dp2px(dp)
```

```kotlin
(View)onFilterShakeClick {
    //TODO: Do Some Thing
}
```

------------

### Java
#### 通过 Rubik 类调用
```java
Rubik.setStatusBarColor(context, colorInt, isFitToSafeArea)
```

```java
Rubik.setNavigationBarColor(context, colorInt)
```

```java
Rubik.getScreenWidth(context)
```

```java
Rubik.getScreenHeight(context)
```

```java
Rubik.px2dp(px)
```

```java
Rubik.dp2px(dp)
```

```java
Rubik.onFilterShakeClick(button, v -> {
    //TODO: Do Some Thing
});
```