package openmodularturrets.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import openmodularturrets.blocks.turretbases.*;
import openmodularturrets.blocks.turretheads.*;
import openmodularturrets.handler.ConfigHandler;
import openmodularturrets.items.blocks.*;
import openmodularturrets.reference.Names;

public class Blocks {
    public static Block turretBaseTierOne;
    public static Block turretBaseTierTwo;
    public static Block turretBaseTierThree;
    public static Block turretBaseTierFour;
    public static Block turretBaseTierFive;
    public static Block disposableItemTurret;
    public static Block potatoCannonTurret;

    public static Block incendiaryTurret;

    public static Block machineGunTurret;
    public static Block grenadeLauncherTurret;

    public static Block relativisticTurret;

    public static Block teleporterTurret;

    public static Block rocketTurret;
    public static Block laserTurret;
    public static Block railGunTurret;
    public static Block leverBlock;

    public static void init() {
        turretBaseTierOne = new BlockTurretBaseTierOne();
        GameRegistry.registerBlock(turretBaseTierOne,
                ItemBlockTurretBaseTierOne.class,
                Names.Blocks.unlocalisedTurretBaseTierOne);

        turretBaseTierTwo = new BlockTurretBaseTierTwo();
        GameRegistry.registerBlock(turretBaseTierTwo,
                ItemBlockTurretBaseTierTwo.class,
                Names.Blocks.unlocalisedTurretBaseTierTwo);

        turretBaseTierThree = new BlockTurretBaseTierThree();
        GameRegistry.registerBlock(turretBaseTierThree,
                ItemBlockTurretBaseTierThree.class,
                Names.Blocks.unlocalisedTurretBaseTierThree);

        turretBaseTierFour = new BlockTurretBaseTierFour();
        GameRegistry.registerBlock(turretBaseTierFour,
                ItemBlockTurretBaseTierFour.class,
                Names.Blocks.unlocalisedTurretBaseTierFour);

        turretBaseTierFive = new BlockTurretBaseTierFive();
        GameRegistry.registerBlock(turretBaseTierFive,
                ItemBlockTurretBaseTierFive.class,
                Names.Blocks.unlocalisedTurretBaseTierFive);

        if (ConfigHandler.getDisposableTurretSettings().isEnabled()) {
            disposableItemTurret = new BlockDisposableTurret();
            GameRegistry.registerBlock(disposableItemTurret,
                    ItemBlockDisposableTurret.class,
                    Names.Blocks.unlocalisedDisposableItemTurret);
        }

        if (ConfigHandler.getPotatoCannonTurretSettings().isEnabled()) {
            potatoCannonTurret = new BlockPotatoCannonTurret();
            GameRegistry.registerBlock(potatoCannonTurret,
                    ItemBlockPotatoCannonTurret.class,
                    Names.Blocks.unlocalisedPotatoCannonTurret);
        }

        if (ConfigHandler.getMachineGunTurretSettings().isEnabled()) {
            machineGunTurret = new BlockMachineGunTurret();
            GameRegistry.registerBlock(machineGunTurret,
                    ItemBlockMachineGunTurret.class,
                    Names.Blocks.unlocalisedMachineGunTurret);

        }

        if (ConfigHandler.getIncendiary_turret().isEnabled()) {
            incendiaryTurret = new BlockIncendiaryTurret();
            GameRegistry.registerBlock(incendiaryTurret,
                    ItemBlockIncendiaryTurret.class,
                    Names.Blocks.unlocalisedIncendiaryTurret);

        }

        if (ConfigHandler.getGrenadeTurretSettings().isEnabled()) {
            grenadeLauncherTurret = new BlockGrenadeLauncherTurret();
            GameRegistry.registerBlock(grenadeLauncherTurret,
                    ItemBlockGrenadeLauncherTurret.class,
                    Names.Blocks.unlocalisedGrenadeTurret);
        }

        if (ConfigHandler.getRelativistic_turret().isEnabled()) {
            relativisticTurret = new BlockRelativisticTurret();
            GameRegistry.registerBlock(relativisticTurret,
                    ItemBlockRelativisticTurret.class,
                    Names.Blocks.unlocalisedRelativisticTurret);

        }

        if (ConfigHandler.getRocketTurretSettings().isEnabled()) {
            rocketTurret = new BlockRocketTurret();
            GameRegistry.registerBlock(rocketTurret,
                    ItemBlockRocketTurret.class,
                    Names.Blocks.unlocalisedRocketTurret);
        }

        if (ConfigHandler.getTeleporter_turret().isEnabled()) {
            teleporterTurret = new BlockTeleporterTurret();
            GameRegistry.registerBlock(teleporterTurret,
                    ItemBlockTeleporterTurret.class,
                    Names.Blocks.unlocalisedTeleporterTurret);
        }

        if (ConfigHandler.getLaserTurretSettings().isEnabled()) {
            laserTurret = new BlockLaserTurret();
            GameRegistry.registerBlock(laserTurret,
                    ItemBlockLaserTurret.class,
                    Names.Blocks.unlocalisedLaserTurret);
        }

        if(ConfigHandler.getRailgun_turret().isEnabled()) {
            railGunTurret = new BlockRailGunTurret();
            GameRegistry.registerBlock(railGunTurret, ItemBlockRailGunTurret.class,
                    Names.Blocks.unlocalisedRailGunTurret);
        }

        leverBlock = new LeverBlock();
        GameRegistry.registerBlock(leverBlock, Names.Blocks.unlocalisedLever);
    }
}
