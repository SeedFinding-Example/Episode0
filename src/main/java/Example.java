import kaptainwutax.biomeutils.biome.Biome;
import kaptainwutax.biomeutils.source.BiomeSource;
import kaptainwutax.biomeutils.source.OverworldBiomeSource;
import kaptainwutax.mcutils.state.Dimension;
import kaptainwutax.mcutils.version.MCVersion;

public class Example {
	public static void main(String[] args) {
		BiomeSource source=BiomeSource.of(Dimension.OVERWORLD, MCVersion.latest(),1L);
		Biome biome=source.getBiome(0,0,0);
		System.out.println(biome.getName());
	}
}
