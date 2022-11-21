import { useFormik } from 'formik';
import { useRouter } from 'next/router';
import * as Yup from 'yup';
import {
  Button,
  Container,
  TextField,
  Box,
  Typography,
  Grid,
} from '@mui/material';
import { NewFormData } from './Interface'


export default function NewFormConstruction() {
  const router = useRouter();
  const { id } = router.query;

  const initialValues: NewFormData = {
    nome: '',
    anoConstrucao: 2022,
    coordenacao: '',
    gerencia: '',
    diretoria: '',
    outorga: '',
    titularidade: ''
  }

  const formSchema = Yup.object().shape({
    nome: Yup.string()
      .required('Digite o nome da Obra')
      .min(2, 'O nome deve ter pelo menos 2 caracteres!'),
    anoConstrucao: Yup.number().required('Digite o ano da construção!').min(4, 'Não abreviar o ano!'),
    coordenacao: Yup.string().required('Digite a coordenação!'),
    gerencia: Yup.string().required('Digite a gerencia!'),
    diretoria: Yup.string().required('Digite a diretoria!'),
    outorga: Yup.string().required('Digite a outorga!'),
    titularidade: Yup.string().required('Digite a titularidade!'),
  });

  const formik = useFormik({
    initialValues: initialValues,
    validationSchema: formSchema,
    onSubmit: (values) => {
      setTimeout(() => {
        alert(JSON.stringify(values, null, 2));
        formik.setSubmitting(false);
      }, 3000);
    },
  });

  return (
    <Container>
      <Box sx={{
        flexGrow: 1
      }}>
        <form noValidate onSubmit={formik.handleSubmit}>
          <Box sx={{
            display: 'flex',
            alignItems: 'center',
            marginTop: 5,
            marginBottom: 5,
            marginLeft: 7,
          }}>
            <Typography component="h4" variant="h4">
              Adicionar Obra
            </Typography>
          </Box>
          <Grid container spacing={2} columns={12}>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="nome"
                label="Nome"
                name="nome"
                autoComplete="nome"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.nome}
                error={formik.touched.nome && Boolean(formik.errors.nome)}
                helperText={formik.touched.nome && formik.errors.nome}
              />
            </Grid>
            <Grid item xs={2}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="anoConstrucao"
                label="Ano da Construção"
                name="anoConstrucao"
                autoComplete="anoConstrucao"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.anoConstrucao}
                error={formik.touched.anoConstrucao && Boolean(formik.errors.anoConstrucao)}
                helperText={formik.touched.anoConstrucao && formik.errors.anoConstrucao}
              />
            </Grid>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="coordenacao"
                label="Coordenação"
                name="coordenacao"
                autoComplete="coordenacao"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.coordenacao}
                error={formik.touched.coordenacao && Boolean(formik.errors.coordenacao)}
                helperText={formik.touched.coordenacao && formik.errors.coordenacao}
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="gerencia"
                label="Gerencia"
                name="gerencia"
                autoComplete="gerencia"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.gerencia}
                error={formik.touched.gerencia && Boolean(formik.errors.gerencia)}
                helperText={formik.touched.gerencia && formik.errors.gerencia}
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="diretoria"
                label="Diretoria"
                name="diretoria"
                autoComplete="diretoria"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.diretoria}
                error={formik.touched.diretoria && Boolean(formik.errors.diretoria)}
                helperText={formik.touched.diretoria && formik.errors.diretoria}
              />
            </Grid>
            <Grid item xs={2}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="outorga"
                label="Outorga"
                name="outorga"
                autoComplete="outorga"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.outorga}
                error={formik.touched.outorga && Boolean(formik.errors.outorga)}
                helperText={formik.touched.outorga && formik.errors.outorga}
              />
            </Grid>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="titularidade"
                label="Titularidade"
                name="titularidade"
                autoComplete="titularidade"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.titularidade}
                error={formik.touched.titularidade && Boolean(formik.errors.titularidade)}
                helperText={formik.touched.titularidade && formik.errors.titularidade}
              />
            </Grid>

          </Grid>
          <Button
            type="submit"
            size="large"
            variant="contained"
            color="primary"
            disabled={formik.isSubmitting}
          >
            Salvar
          </Button>
        </form>
      </Box >
    </Container >
  );
}