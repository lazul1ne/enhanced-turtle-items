package xyz.lazuline.item.custom;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xyz.lazuline.item.ModArmorMaterials;
import java.util.Map;

public class ModArmorItem extends ArmorItem {


    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =


            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())


                    .put(ModArmorMaterials.TURTLE_NETHERITE, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 1,


                            false, false, true))//.build();
                    .put(ModArmorMaterials.TURTLE_DIAMOND, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 1,


                            false, false, true))
                    .put(ModArmorMaterials.TURTLE_GOLD, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 1,


                            false, false, true))
                    .put(ModArmorMaterials.TURTLE_IRON, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 1,


                            false, false, true))
                    .put(ModArmorMaterials.TURTLE_CHAIN, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 1,


                            false, false, true))
                    .put(ModArmorMaterials.TURTLE_LEATHER, new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 1,


                            false, false, true)).build();







    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {


        super(material, type, settings);


    }





    @Override


    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {


        if(!world.isClient()) {


            if(entity instanceof PlayerEntity player /*&& hasFullSuitOfArmorOn(player)*/) {


                evaluateArmorEffects(player);


            }


        }





        super.inventoryTick(stack, world, entity, slot, selected);


    }





    private void evaluateArmorEffects(PlayerEntity player) {


        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {


            ArmorMaterial mapArmorMaterial = entry.getKey();


            StatusEffectInstance mapStatusEffect = entry.getValue();





            if(hasCorrectArmorOn(mapArmorMaterial, player)) {


                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);


            }


        }


    }





    private void addStatusEffectForMaterial(PlayerEntity player, ArmorMaterial mapArmorMaterial, StatusEffectInstance mapStatusEffect) {


        boolean hasPlayerEffect = player.hasStatusEffect(mapStatusEffect.getEffectType());





        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {


            player.addStatusEffect(new StatusEffectInstance(mapStatusEffect));


        }


    }







    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        ItemStack helmetStack = player.getInventory().getArmorStack(3); // Get helmet slot

        if (helmetStack.isEmpty() || !(helmetStack.getItem() instanceof ArmorItem)) {
            return false;
        }

        ArmorItem helmet = (ArmorItem) helmetStack.getItem();
        return helmet.getMaterial() == material;
    }




}