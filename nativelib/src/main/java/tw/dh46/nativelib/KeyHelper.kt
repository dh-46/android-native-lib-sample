package tw.dh46.nativelib

/**
 *  Created by DanielHuang on 2021/12/8
 */
class KeyHelper {

    external fun getSecretKey(): String

    companion object {

        init {
            System.loadLibrary("nativelib")
        }

        val secretKey = KeyHelper().getSecretKey()
    }
}