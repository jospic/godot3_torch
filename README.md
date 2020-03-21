GoTorch
=====
This is an Android plugin, for Godot Engine 3.2 or higher, for turn on/off camera Flashlight on Android devices. 

How to use
----------
- Configure, install  and enable the "Android Custom Template" for your project, just follow the [official documentation](https://docs.godotengine.org/en/latest/getting_started/workflow/export/android_custom_build.html);
- go to the [release tab](https://github.com/jospic/godot3_torch/releases), choose a version and download the respective zip package;
- drop the ```torch-plugin``` directory (from the zip package) inside the ```res://android/``` directory on your Godot project.
- on the Project -> Export -> Android -> Options -> Permissions: check the permissions for FLASHLIGHT
- on the Project Settings -> Android -> Modules, add the string:

```
org/godotengine/godot/Torch
```
Sample Code
---------
The files in the root of this repository can be used as a Godot demo project, after enabling the "Android Custom Template" and moving ```torch-plugin``` directory under ```res://android/``` directory

Donations
---------
Was this project useful for you? Wanna make a donation? These are the options:

### Paypal

My [Paypal donation link](https://www.paypal.me/donatejospic?locale.x=it_IT)

API Reference
-------------

### Properties
```python

var torch
if Engine.has_singleton("Torch"):
		torch = Engine.get_singleton("Torch")

torch.switchFlashLight(true) #light on

torch.switchFlashLight(false) #light off

```

Troubleshooting
--------------
* First of all, please make sure you're able to compile the custom build for Android without the GoTorch plugin, this way we can isolate the cause of the issue.

* Using logcat for Android is the best way to troubleshoot most issues. You can filter Godot only messages with logcat using the command: 
```
adb logcat -s godot
```

References
-------------
Based on the native java code of:
* https://www.simplifiedcoding.net/turn-on-flashlight-android/

License
-------------
MIT license
