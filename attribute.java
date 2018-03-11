public class Attribute {
	//属性类
	//构造函数
	public Attribute(String attributeName,   //属性名
			         boolean isContinuous,   //是否连续值
			         boolean isIgnored,      //是否忽视
			         Object attributeValue)  //属性值 
	{
		this.attributeName = attributeName;
		this.isContinuous = isContinuous;
		this.isIgnored = isIgnored;
		this.attributeValue = attributeValue;
	}
}