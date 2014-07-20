package com.emokiba.rockcandy.recipe;


import com.emokiba.rockcandy.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeRegistry
{


    public static void init(){
        final int i = Short.MAX_VALUE;
        GameRegistry.addRecipe(new ItemStack(ModItems.unprocessedsugarCore), new Object[]{
                "AAA",
                "ABA",
                "AAA",
                'A', Items.sugar ,'B',Items.diamond
        });
        GameRegistry.addRecipe(new ItemStack(ModItems.sweetrockCandy,4), new Object[]{
                "CAC",
                "ABA",
                "CAC",
                 'A', Items.sugar ,'B',new ItemStack(ModItems.sugarCore,1,i),'C',ModItems.rockCandy
        });
        GameRegistry.addRecipe(new ItemStack(ModItems.plentifulCandy,4), new Object[]{
                " A ",
                "ABA",
                " A ",
                'A', ModItems.rockCandy ,'B',new ItemStack(ModItems.sugarCore,1,i)
        });
        GameRegistry.addRecipe(new ItemStack(ModItems.fatCandy, 4), new Object[]{
                        " A ",
                        "ABA",
                        " A ",
                        'A', ModItems.plentifulCandy, 'B', new ItemStack(ModItems.sugarCore, 1, i)
                });
        GameRegistry.addRecipe(new ItemStack(ModItems.healthyCandy, 4), new Object[]{
                "DAD",
                "CBC",
                "DAD",
                'A', Items.carrot, 'B', new ItemStack(ModItems.sugarCore, 1, i),'C',Items.potato,'D',ModItems.rockCandy
        });
                GameRegistry.addSmelting(new ItemStack(ModItems.unprocessedsugarCore), new ItemStack(ModItems.sugarCore), 0.0F);


    }
}