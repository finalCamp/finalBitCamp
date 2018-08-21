<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
	<link rel="stylesheet" href="assets_mypage/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
	<link rel="stylesheet" href="assets_mypage/css/ready.css">
	<link rel="stylesheet" href="assets_mypage/css/demo.css">
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
   <script type="text/javascript" src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="wrapper">
		<div class="main-header">
			<div class="logo-header">
			    <div class="logo-text">
                    <a href="index.html" class="logo">
                    <i class="far fa-compass fa-2x"></i>
                    </a>
                    <a class="logo" href="#">Camping Scanner</a>
				</div>
				<button class="navbar-toggler sidenav-toggler ml-auto" type="button" data-toggle="collapse" data-target="collapse" aria-controls="sidebar" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<button class="topbar-toggler more"><i class="la la-ellipsis-v"></i></button>
			</div>
			<nav class="navbar navbar-header navbar-expand-lg">
				<div class="container-fluid">
					
					<form class="navbar-left navbar-form nav-search mr-md-3" action="">
					 <div class="form-inline">
						<div class="input-group mr-md-2">
							<input type="text" placeholder="" class="form-control">
							<div class="input-group-append">
								<span class="input-group-text">
									<i class="la la-search search-icon"></i>
								</span>
							</div>
						</div>
						<div class="input-group mr-md-2">
						    <input id="datepicker" type="text" placeholder="출발일" class="form-control">
						</div>
						<div class="input-group mr-md-2">
						    <input id="datepicker" type="text" placeholder="도착일" class="form-control">
						</div>
						<label for="people">성인</label>
						<div class="input-group mr-md-2">
						    <select class="form-control people">
                              <option>1</option>
                              <option>2</option>
                              <option>3</option>
                              <option>4</option>
                              <option>5</option>
                            </select>
						</div>
						<label for="people">유아</label>
						<div class="input-group">
						    <select class="form-control people">
                              <option>0</option>
                              <option>1</option>
                              <option>2</option>
                              <option>3</option>
                              <option>4</option>
                              <option>5</option>
                            </select>
						</div>
						</div>
					</form>
					<ul class="navbar-nav topbar-nav ml-md-auto align-items-center">
						<li class="nav-item dropdown hidden-caret">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								내 캠핑장 등록
							</a>
						</li>
						<li class="nav-item dropdown hidden-caret">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								고객센터
							</a>
						</li>
						<li class="nav-item dropdown hidden-caret">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								마이페이지
							</a>
						</li>
						</ul>
					</div>
				</nav>
			</div>
			<div class="sidebar">
				<div class="scrollbar-inner sidebar-wrapper">
					<div class="user">
						<div class="info">
							<a class="">
								<span>
									권석현 님
									<span class="user-level">환영합니다.</span>
								</span>
							</a>
							<div class="clearfix"></div>
						</div>
					</div>
					<ul class="nav">
						<li class="nav-item active">
							<a href="memberMyBooking.html">
								<i class="la la-dashboard"></i>
								<span>나의예약</span>
							</a>
						</li>
						<li class="nav-item">
							<a href="components.html">
								<i class="fas fa-pen"></i>
								<span>내가 작성한 글</span>
							</a>
						</li>
						<li class="nav-item">
							<a href="forms.html">
								<i class="far fa-heart"></i>
								<span>내가 찜한 캠핑장</span>
							</a>
						</li>
						<li class="nav-item">
							<a href="tables.html">
								<i class="la la-th"></i>
								<span>내 정보 수정</span>
							</a>
						</li>
						<li class="nav-item">
							<a href="notifications.html">
								<i class="la la-bell"></i>
								<span>Notifications<br>혹시 쓰게 될지도 몰라서 남겨놓음</span>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="main-panel">
				<div class="content">
					<div class="container">
						<h4 class="page-title">나의예약</h4>
						
						<!-- 조회  -->     
						<div class="row">
						     <table class="table table-bordered col-md-12">
                                <tbody>
                                  <tr>
                                    <th>검색조건</th>
                                    <td> 
                                        <div class="form-inline">
                                            <div class="form-group">
                                                <select class="form-control">
                                                <option>회원아이디</option>
                                                </select>
                                                <input type="text" class="form-control">
                                            </div>
                                        </div>
                                    </td>
                                  </tr>
                                  <tr>
                                    <th>예약일자</th>
                                        <td>
                                            <div class="form-inline">
                                                <button class="btn btn-default">전체보기</button>
                                            <div class="form-group">
                                                <div class='input-inline date' id='datetimepicker6'>
                                                    <div class="input-group date">
        				                                <input type="text" class="form-control" id="datepicker">
        			                                </div>
                                                </div>
                                            </div>
                                            <div class="input-group date">
        				                        <input type="text" class="form-control" id="datepicker">
        			                        </div>
                                        </div>
                                        </td>
                                  </tr>
                                </tbody>
                                </table>
                                    <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1" style="float:none; margin:0 auto;">
                                        <button type="submit" class="btn btn-primary">조회</button>
                                    </div>
                                    
                             <!-- 예약 리스트 -->       
							<div class="container">
                                <div class="row mt-md-4">
                              <table class="table table-bordered" style="text-align:center">
                                <thead>
                                  <tr>
                                    <th>번호</th>
                                    <th>상태</th>
                                    <th>예약번호</th>
                                    <th>예약자명</th>
                                    <th>구분</th>
                                    <th>예약일자</th>
                                    <th>숙박일수</th>
                                    <th>예약수/번호</th>
                                    <th>예약금액</th>
                                    <th>입금할금액</th>
                                    <th>관리</th>
                                  </tr>
                                </thead>
                                <tbody>
                                  <tr>
                                    <td>1</td>
                                    <td style="color:#4CAF50; font-weight:bolder">예약완료</td>
                                    <td>111-222</td>
                                    <td><a href="#">채지인</a></td>
                                    <td>방가로</td>
                                    <td>2018-07-26</td>
                                    <td>1박2일</td>
                                    <td>1개/7</td>
                                    <td>80,000</td>
                                    <td>80,000</td>
                                    <td><button class="btn btn-default" type="submit" style="margin-right:10px" data-toggle="modal" data-target="#detailModal">상세보기</button></td>
                                  </tr>
                                </tbody>
                              </table>
                                </div>
                            </div>
                        </div>
						</div>
						</div>
						</div>
	<!-- Modal -->
	<div class="modal fade" id="detailModal" tabindex="-1" role="dialog" aria-labelledby="modalUpdatePro" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header bg-primary">
					<h6 class="modal-title"><i class="la la-frown-o"></i> Under Development</h6>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body text-center">									
					<p>Currently the pro version of the <b>Ready Dashboard</b> Bootstrap is in progress development</p>
					<p>
						<b>We'll let you know when it's done</b></p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
</div>
	<script type="text/javascript">
	$(function(){
		$("#datepicker").datepicker();
	})
	</script>
</body>
<script src="assets_mypage/js/core/jquery.3.2.1.min.js"></script>
<script src="assets_mypage/js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
<script src="assets_mypage/js/core/popper.min.js"></script>
<script src="assets_mypage/js/core/bootstrap.min.js"></script>
<script src="assets_mypage/js/plugin/chartist/chartist.min.js"></script>
<script src="assets_mypage/js/plugin/chartist/plugin/chartist-plugin-tooltip.min.js"></script>
<script src="assets_mypage/js/plugin/bootstrap-notify/bootstrap-notify.min.js"></script>
<script src="assets_mypage/js/plugin/bootstrap-toggle/bootstrap-toggle.min.js"></script>
<script src="assets_mypage/js/plugin/jquery-mapael/jquery.mapael.min.js"></script>
<script src="assets_mypage/js/plugin/jquery-mapael/maps/world_countries.min.js"></script>
<script src="assets_mypage/js/plugin/chart-circle/circles.min.js"></script>
<script src="assets_mypage/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>
<script src="assets_mypage/js/ready.min.js"></script>
<script src="assets_mypage/js/demo.js"></script>
</html>