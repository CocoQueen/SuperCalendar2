# SuperCalendar2
How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.CocoQueen:SuperCalendar2:Tag'
	}


非Androidx版本可以查看https://gitee.com/a945768271A/SuperCalendar 这个网址