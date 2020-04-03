import net.minecraft.client.main.Main;

public class Start
{
    public static void main(String[] args)
    {
        Main(concat(new String[] {"--version", "mcp", "--accessToken", "0", "--assetsDire", "asset", "--assetIndex", "1.9.18", "--userProperti", "{}"}, args));
    }

    public static <T> T[] concat(T[] first, T[] second)
    {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
