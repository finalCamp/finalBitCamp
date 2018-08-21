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
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
  
<!-- 캘린더 -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.standalone.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>

<!--  jQuery UI CSS파일  -->
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />  
<!-- jQuery 기본 js파일 -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<!-- jQuery UI 라이브러리 js파일 -->
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>  
 
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
			<nav class="navbar navbar-header navbar-expand-lg"> <!-- 검색창 부분  -->
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
						    <input type="text" placeholder="출발일" class="testDatepicker form-control">
						</div>
						<div class="input-group mr-md-2">
						    <input type="text" placeholder="도착일" class="testDatepicker form-control">
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
			
			<div class="sidebar"> <!-- 사이드메뉴  -->
				<div class="scrollbar-inner sidebar-wrapper">
					<div class="user">
						<div class="info">
							<a class="">
								<span>
									채지인 님,
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
			
			<div class="main-panel"> <!-- 나의 예약 메인 화면  -->
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
                                                <select class="form-control mr-md-2">
                                                <option>아이디</option>
                                                <option>예약번호</option>
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
													<input type="text" class="testDatepicker form-control mr-md-2" placeholder="시작">
													<i class="far fa-window-minimize"></i>
													<input type="text" class="testDatepicker form-control ml-md-2" placeholder="끝">
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
                                    <td style="color:#4CAF50; font-weight:bolder">결제완료</td>
                                    <td>111-222</td>
                                    <td>채지인</td>
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
	
</div>

<!-- Modal -->
<div class="container">
  <div class="modal fade" id="detailModal" role="dialog">
    <div class="modal-dialog modal-lg">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <h4 class="modal-title">예약정보</h4>
           <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <div class="modal-body">
        <!-- modal 내용  -->
        
        <form action="" class="form-group">
        	<table class="table table-bordered">
			      <tr>
			        <th>예약정보</th>
			        <td>111-22222</td>
			      </tr>
			      <tr>
			      	<th>사이트(방)이름</th>
			      	<td>방가로</td>
			      </tr>
			      <tr>
			      	<th>예약일</th>
			      	<td>2018-08-10</td>
			      </tr>
			      <tr>
			      	<th>인원/차량</th>
			      	<td>
			      		<table>
			      			<thead>
			      				<tr>
			      					<th>번호</th>
			      					<th>이용기간</th>
			      					<th>숙박인원</th>
			      					<th>차량</th>
			      				</tr>
			      			</thead>
							<tbody>
								<tr>
									<td>7</td>
									<td>1박2일</td>
									<td>성인(2) 미성년(3)</td>
									<td>1대</td>
								</tr>
							</tbody>
			      		</table>
			      	</td>
			      </tr>
			      <tr>
			      	<th>이용내역</th>
			      	<td>
			      		<table>
			      			<thead>
			      				<tr>
			      					<th>내역</th>
			      					<th>비용</th>
			      				</tr>
			      				<tr>
			      					<td>2018.07.28(1박) 80,000원</td>
			      					<td>80,000원</td>
			      				</tr>
			      			</thead>
			      		</table>
			      	</td>
			      </tr>
			      <tr>
			      	<th>총 이용금액</th>
			      	<td>80,000원</td>
			      </tr>
			      <tr>
			      	<th>총 입금금액</th>
			      	<td>75,500원(-500 마일리지사용)</td>
			      </tr>
			      <tr>
			      	<th>예약자정보</th>
			      	<td>채지인(010-1111-1111)</td>
			      </tr>
			      <tr>
			      	<th>결제방법</th>
			      	<td>신용카드</td>
			      </tr>
			      <tr>
			      	<th>결제방법</th>
			      	<td>신용카드</td>
			      </tr>
			      <tr>
			      	<th>현재상태</th>
			      	<td style="color:MediumSeaGreen; font-weight:bolder">결제완료</td>
			      </tr>
  			</table>
        </form>
          
        </div>
        <div class="modal-footer">
        	<button type="button" class="btn btn-warning">예약취소</button>
        	<button type="button" class="btn btn-default">수정하기</button>
          	<button type="button" class="btn btn-primary" data-dismiss="modal">닫기</button>
        </div>
      </div>
      
    </div>
  </div>
</div>

<script type="text/javascript">

//캘린더
$(function() {
    $( ".testDatepicker" ).datepicker({
         changeMonth: true, 
         dayNames: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],
         dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
         monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
         monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월']
  });
});

</script>
	
</body>

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