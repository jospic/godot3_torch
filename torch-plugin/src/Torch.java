package org.godotengine.godot;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
 
public class Torch extends Godot.SingletonBase {
 
    private Godot activity;
    private CameraManager mCameraManager;
    private String mCameraId;
    
    public void switchFlashLight(boolean status) {
        try {
            mCameraId = mCameraManager.getCameraIdList()[0];
            mCameraManager.setTorchMode(mCameraId, status);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    static public Godot.SingletonBase initialize(Activity p_activity) {
		return new Torch(p_activity);
	}

    public Torch(Activity p_activity) {
        this.activity = (Godot) p_activity;
        this.mCameraManager = (CameraManager) this.activity.getSystemService(Context.CAMERA_SERVICE);

        registerClass("Torch", new String[]{"switchFlashLight"});
    }


}