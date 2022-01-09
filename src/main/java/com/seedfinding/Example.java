package com.seedfinding;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.version.MCVersion;

public class Example {
	public static void main(String[] args) {
		BiomeSource source=BiomeSource.of(Dimension.OVERWORLD, MCVersion.latest(),1L);
		Biome biome=source.getBiome(0,0,0);
		System.out.println(biome.getName());
	}
}
