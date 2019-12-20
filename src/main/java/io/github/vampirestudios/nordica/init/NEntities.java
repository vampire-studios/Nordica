package io.github.vampirestudios.nordica.init;

import io.github.vampirestudios.nordica.Nordica;
import io.github.vampirestudios.nordica.entity.FemaleVikingEntity;
import io.github.vampirestudios.nordica.entity.MaleVikingEntity;
import io.github.vampirestudios.vampirelib.utils.registry.EntityRegistryBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;

public class NEntities {

    public static EntityType<MaleVikingEntity> MALE_VIKING;
    public static EntityType<FemaleVikingEntity> FEMALE_VIKING;

    public static void init() {
        MALE_VIKING = EntityRegistryBuilder.<MaleVikingEntity>createBuilder(new Identifier(Nordica.MOD_ID, "male_viking"))
                .entity(MaleVikingEntity::new)
                .category(EntityCategory.AMBIENT)
                .dimensions(EntityDimensions.fixed(0.5F, 2.0F))
                .hasEgg(true)
                .egg(0xFFFFFFFF, 0xFF000000)
                .build();
        FEMALE_VIKING = EntityRegistryBuilder.<FemaleVikingEntity>createBuilder(new Identifier(Nordica.MOD_ID, "female_viking"))
                .entity(FemaleVikingEntity::new)
                .category(EntityCategory.AMBIENT)
                .dimensions(EntityDimensions.fixed(0.5F, 2.0F))
                .hasEgg(true)
                .egg(0xFFFFFFFF, 0xFF000000)
                .build();
    }

}
