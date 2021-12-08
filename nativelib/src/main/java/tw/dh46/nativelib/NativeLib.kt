package tw.dh46.nativelib

/**
 * Native lib 負責載入與呼叫 C++ 程式碼
 *
 * @constructor Create empty Native lib
 */
class NativeLib {

    /**
     * A native method that is implemented by the 'nativelib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    /**
     * Get secret key
     *
     * @return
     */
    external fun getSecretKey(): String

    companion object {
        // Used to load the 'nativelib' library on application startup.
        init {
            System.loadLibrary("nativelib")
        }
    }
}