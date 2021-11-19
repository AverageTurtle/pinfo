package net.pinfo;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer;

public class pinfo implements ModInitializer {

    public static MinecraftServer SERVER;

    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTING.register(pinfo::onServerStarting);

        Commands.register();
    }
    private static void onServerStarting(MinecraftServer server) {
        SERVER = server;

    }
}
