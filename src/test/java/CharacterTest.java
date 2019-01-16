

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CharacterTest {

	
	
//	@Before
//	public void setup() {
//		character = new Character();
//	}
	
	
	@Test
	public void testDefaultConstructor() {
		
		new Character();
		
	}
	
	@Test
	public void testName(){
		
		Character character = new Character("Foo",20,"None",0,false);
		
		assertEquals("Foo",character.getName());

	}
	
	@Test
	public void testHP(){
		
		Character character = new Character("Foo",20,"None",0,false);
		
		assertEquals(20,character.getHitPoints());

	}
	@Test
	public void testStatus(){
		
		Character character = new Character("Foo",20,"None",0, false);
		
		assertEquals("None",character.getStatus());

	}
	
	@Test
	public void testChangeHP() {
		
		Character character = new Character("Foo",20,"None",0,false);
		
		assertEquals(15,character.changeHP(15));
	}
	
	
	@Test
	public void testApplyStatus() {
		
	Character character = new Character("Foo",20,"None",0, false);
		
	assertEquals("Poison", character.applyStatus("Poison"));
		
	}
	
	
	
}
	
	
	
	
	
	

