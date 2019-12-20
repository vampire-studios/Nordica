package io.github.vampirestudios.nordica.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.world.World;

public class MaleVikingEntity extends VikingEntity {

    public MaleVikingEntity(EntityType<? extends MobEntityWithAi> type, World world) {
        super(type, world);
    }

}
