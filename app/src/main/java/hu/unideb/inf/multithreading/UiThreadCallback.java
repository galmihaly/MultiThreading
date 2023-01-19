package hu.unideb.inf.multithreading;

import android.os.Message;

public interface UiThreadCallback {
    void publishToUiThread(Message message);
}