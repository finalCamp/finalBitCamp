package model;

public class Facility {
	int num;
	String campId;
	boolean campToilet;
	boolean campShower;
	boolean campElect;
	boolean campCaravan;
	boolean campGlamping;
	boolean campPlayground;
	boolean campFood;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCampId() {
		return campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}
	public boolean isCampToilet() {
		return campToilet;
	}
	public void setCampToilet(boolean campToilet) {
		this.campToilet = campToilet;
	}
	public boolean isCampShower() {
		return campShower;
	}
	public void setCampShower(boolean campShower) {
		this.campShower = campShower;
	}
	public boolean isCampElect() {
		return campElect;
	}
	public void setCampElect(boolean campElect) {
		this.campElect = campElect;
	}
	public boolean isCampCaravan() {
		return campCaravan;
	}
	public void setCampCaravan(boolean campCaravan) {
		this.campCaravan = campCaravan;
	}
	public boolean isCampGlamping() {
		return campGlamping;
	}
	public void setCampGlamping(boolean campGlamping) {
		this.campGlamping = campGlamping;
	}
	public boolean isCampPlayground() {
		return campPlayground;
	}
	public void setCampPlayground(boolean campPlayground) {
		this.campPlayground = campPlayground;
	}
	public boolean isCampFood() {
		return campFood;
	}
	public void setCampFood(boolean campFood) {
		this.campFood = campFood;
	}
	@Override
	public String toString() {
		return "Facility [num=" + num + ", campId=" + campId + ", campToilet=" + campToilet + ", campShower="
				+ campShower + ", campElect=" + campElect + ", campCaravan=" + campCaravan + ", campGlamping="
				+ campGlamping + ", campPlayground=" + campPlayground + ", campFood=" + campFood + "]";
	}
	
}
