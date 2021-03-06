#include <jni.h>
#include <string>
#include "base64.h"

extern "C" JNIEXPORT jstring JNICALL
Java_tw_dh46_nativelib_NativeLib_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_tw_dh46_nativelib_NativeLib_getDecodedSecretKey(
        JNIEnv *env,
        jobject) {
    std::string key = "VGhpcyBpcyBteSBzZWNyZXQga2V5Lg==";
    std::string result = b64decode(key.c_str(), key.length());
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_tw_dh46_nativelib_KeyHelper_getSecretKey(
        JNIEnv *env,
        jobject) {
    std::string key = "My another secret key";
    return env->NewStringUTF(key.c_str());
}