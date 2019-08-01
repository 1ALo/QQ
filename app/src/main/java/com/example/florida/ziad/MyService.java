package com.example.florida.ziad;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {
    MediaPlayer mediaPlayer;
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer=new MediaPlayer();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        mediaPlayer=MediaPlayer.create(this,R.raw.ziad);
        mediaPlayer.start();

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.reset();

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
