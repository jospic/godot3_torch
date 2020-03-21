extends Control

var lightOn = false
var torch

func _ready():
	if Engine.has_singleton("Torch"):
		torch = Engine.get_singleton("Torch")
	pass
		
func _on_Button_pressed():
	if (lightOn):
		lightOn = false
		$Button.set_text("Lights On")
		print ("luce spenta")
		if (torch):
			torch.switchFlashLight(false) 
	else:
		lightOn = true
		$Button.set_text("Lights Off")
		print ("luce accesa")
		if (torch):
			torch.switchFlashLight(true) 
