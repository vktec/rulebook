package vktec.rulebook.mixin;

import net.minecraft.server.command.FillCommand;
import net.minecraft.server.command.ServerCommandSource;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import vktec.rulebook.RulebookMod;

@Mixin(value = FillCommand.class, priority = 1001)
abstract class FillCommandMixin {
	@ModifyConstant(
		method = "execute",
		constant = @Constant(intValue = 0x8000)
	)
	private static int ruleFillVolume(int value, ServerCommandSource source) {
		return source.getWorld().getGameRules().getInt(RulebookMod.FILL_VOLUME);
	}
}
