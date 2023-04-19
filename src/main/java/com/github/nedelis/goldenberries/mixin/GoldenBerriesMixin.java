package com.github.nedelis.goldenberries.mixin;

import com.github.nedelis.goldenberries.GoldenBerries;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class GoldenBerriesMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		GoldenBerries.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
