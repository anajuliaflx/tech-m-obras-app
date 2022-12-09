import react, { useState } from 'react';
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
import CircularProgress from '@mui/material/CircularProgress';
import { NewFormData } from './Interface';
import api from '../../api';


export default function NewFormInspection() {
  const [loading, setLoading] = useState<boolean>(false);
  const router = useRouter();
  const { id } = router.query;

  const onSubmit = async (formData: any) => {
    setLoading(true);
    try {
      const { data } = await api.post(`api/obra/${id}`, formData);
      if (data) {
        setLoading(false);
        router.push('/');
      }
    } catch (error) {
      console.log(error);
    }
    setLoading(false);
  };

  const initialValues: NewFormData = {
    frequencia: "",
    mes: 0,
    status: "",
    prioridade: 0,
  };

  const formSchema = Yup.object().shape({
    frequencia: Yup.string().required('Digite a frequencia'),
    mes: Yup.string().required('Digite o ano da estado!'),
    status: Yup.string().required('Digite a prioridade!'),
    prioridade: Yup.string().required('Digite a latitude!'),
  });

  const formik = useFormik({
    initialValues: initialValues,
    validationSchema: formSchema,
    onSubmit,
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
              Adicionar Ispeção
            </Typography>
          </Box>
          <Grid container spacing={2} columns={12}>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="frequencia"
                label="Frequencia"
                name="frequencia"
                autoComplete="frequencia"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.frequencia}
                error={formik.touched.frequencia && Boolean(formik.errors.frequencia)}
                helperText={formik.touched.frequencia && formik.errors.frequencia}
              />
            </Grid>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="mes"
                label="Mes"
                name="mes"
                autoComplete="mes"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.mes}
                error={formik.touched.mes && Boolean(formik.errors.mes)}
                helperText={formik.touched.mes && formik.errors.mes}
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="prioridade"
                label="Prioridade"
                name="prioridade"
                autoComplete="prioridade"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.prioridade}
                error={formik.touched.prioridade && Boolean(formik.errors.prioridade)}
                helperText={formik.touched.prioridade && formik.errors.prioridade}
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="status"
                label="Status"
                name="status"
                autoComplete="status"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.status}
                error={formik.touched.status && Boolean(formik.errors.status)}
                helperText={formik.touched.status && formik.errors.status}
              />
            </Grid>
          </Grid>
          <Button
            type="submit"
            size="large"
            variant="contained"
            color="primary"
            disabled={loading && formik.isSubmitting}
          >
            {loading && <CircularProgress />}Salvar
          </Button>
        </form>
      </Box >
    </Container >
  );
}