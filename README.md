# Goal of this project
Sample project demonstrating the transition with [ActivityOptionsCompat#makeSceneTransitionAnimation()](https://developer.android.com/reference/android/support/v4/app/ActivityOptionsCompat.html#makeSceneTransitionAnimation(android.app.Activity, android.view.View, java.lang.String)) is broken when a target view has an [anchor](https://developer.android.com/reference/android/support/design/widget/CoordinatorLayout.LayoutParams.html#setAnchorId(int)) set.

See [this bugreport](https://code.google.com/p/android/issues/detail?id=182322)
