package me.time6628.clag.sponge.commands;

import me.time6628.clag.sponge.CatClearLag;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

/**
 * Created by TimeTheCat on 10/22/2016.
 */
public class RemoveHostilesCommand implements CommandExecutor {
    CatClearLag plugin;
    public RemoveHostilesCommand(CatClearLag catClearLag) {
        this.plugin = catClearLag;
    }

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        src.sendMessage(Text.builder().append(plugin.prefix).color(TextColors.LIGHT_PURPLE).append(Text.of("Removing hostiles...")).build());
        plugin.removeHostile();
        src.sendMessage(Text.builder().append(plugin.prefix).color(TextColors.LIGHT_PURPLE).append(Text.of("Hostiles removed...")).build());
        return CommandResult.success();
    }
}