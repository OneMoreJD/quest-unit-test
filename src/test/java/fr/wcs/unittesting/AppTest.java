package fr.wcs.unittesting;

import org.junit.Test;

import org.junit.Assert;

public class AppTest {

    @Test
    public void ShouldReturnA()
    {
        Assert.assertEquals("a", StringUtils.vowels("lac"));
        Assert.assertEquals("a", StringUtils.uniqueVowels("lac"));
    }

    @Test
    public void ShouldReturnNull()
    {
        Assert.assertNull(StringUtils.vowels(null));
        Assert.assertNull(StringUtils.uniqueVowels(null));
    }
    
    @Test
    public void ShouldReturnEmpty()
    {
        Assert.assertEquals("", StringUtils.vowels("zdfrtgkjvnbc"));
        Assert.assertEquals("", StringUtils.uniqueVowels("zdfrtgkjvnbc"));
    }
    
    
    @Test
    public void ShouldReturnEEE()
    {
        Assert.assertEquals("eee", StringUtils.vowels("epee"));
    }

    @Test
    public void ShouldReturnE()
    {
        Assert.assertEquals("e", StringUtils.uniqueVowels("epee"));
    }
    

    @Test
    public void ShouldReturnEU()
    {
        Assert.assertEquals("eu", StringUtils.uniqueVowels("equerre"));
    }
}
