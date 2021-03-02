package org.mkmc.blacklight.mixin;

import net.minecraft.client.renderer.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {
    @ModifyVariable(
            method = "renderSky(Lcom/mojang/blaze3d/matrix/MatrixStack;F)V",
            at = @At(value = "STORE"),
            ordinal = 0
    )
    private double onRenderSky(double d0) {
        return 1.0D;
    }
}