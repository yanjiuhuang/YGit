#define __cplusplus
#include <jni.h>

#include <android/log.h>

#define LCTX "YGit.Main"

#define DEBUG(args...) \
    __android_log_print(ANDROID_LOG_DEBUG, LCTX, args)

#define ERROR(args...) \
    __android_log_print(ANDROID_LOG_ERROR, LCTX, args)

#define INFO(args...) \
    __android_log_print(ANDROID_LOG_INFO, LCTX, args)
/*
jstring
Java_com_enqu_ygit_GitManager_test( JNIEnv*  env,
                                      jobject  this,
                                      jint     x,
                                      jint     y )
{
	int main, min, major;
	git_libgit2_version(&main, &min, &major);
	INFO("Get the version info: %d.%d.%d", main, min, major);
	char* str[12];
	getCharsFromInts(str, 12, main, min, major);
    return env->NewStringUTF(str);
}

void getCharsFromInts(char* version, int length, int main, int min, int major){
	if(length < 12){
		ERROR("The char set is invalid");
		return;
	}

	getCharsFromSingleInt(version, 0, 2, main);
	version[3] = '.';
	getCharsFromSingleInt(version, 4, 6, min);
	version[7] = '.';
	getCharsFromSingleInt(version, 8, 10, major);
	version[11] = '\0';

}

void getCharsFromSingleInt(char* str, int startIndex, int endIndex, int sourceInt){

	int temp = sourceInt;
	int c;
	int point = endIndex;

	if((str+startIndex) == NULL || (str + endIndex) == NULL){
		ERROR("The char set is null ");
		return;
	}


	while(temp >= 10 || point <= startIndex){
		c = temp % 10;
		temp = temp / 10;
		str[point] = (char)('0' + c);
		point--;

	}
}*/
